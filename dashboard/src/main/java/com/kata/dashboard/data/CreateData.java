package com.kata.dashboard.data;

import jakarta.annotation.PostConstruct;
import net.datafaker.Faker;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class CreateData {

    @PostConstruct
    private void postConstruct() {
        String postURI = "http://localhost:8080/api/v1/post";
        Faker faker = new Faker();
        JSONObject postObject = new JSONObject();
        postObject.put("createdBy", faker.howIMetYourMother().character());
        postObject.put("content", faker.howIMetYourMother().quote());
        Mono<String> postApiResponse = WebClient.create()
                .post()
                .uri(postURI)
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON)
                .bodyValue(postObject.toString())
                .retrieve()
                .bodyToMono(String.class);
        postApiResponse.flatMap(post -> {
            JSONObject postJson = new JSONObject(post);
            JSONObject commentObject = new JSONObject();
            String postId = postJson.getString("id");
            commentObject.put("postId", postId);
            commentObject.put("createdBy", faker.howIMetYourMother().character());
            commentObject.put("content", faker.howIMetYourMother().quote());
            String commentURI = "http://localhost:8081/api/v1/comment/" + postId;
            return WebClient.create()
                    .post()
                    .uri(commentURI)
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .bodyValue(commentObject.toString())
                    .retrieve()
                    .bodyToMono(String.class);
        }).flatMap(comment -> {
            JSONObject postJson = new JSONObject(comment);
            JSONObject commentObject = new JSONObject();
            String postId = postJson.getString("postId");
            commentObject.put("postId", postId);
            commentObject.put("createdBy", faker.howIMetYourMother().character());
            commentObject.put("content", faker.howIMetYourMother().quote());
            String commentURI = "http://localhost:8081/api/v1/comment/" + postId;
            return WebClient.create()
                    .post()
                    .uri(commentURI)
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON)
                    .bodyValue(commentObject.toString())
                    .retrieve()
                    .bodyToMono(String.class);
        }).subscribe();
    }
}
