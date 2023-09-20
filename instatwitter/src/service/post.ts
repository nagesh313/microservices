import axios from "axios"

export const getAllPosts = async () => {
    const posts = await axios.get("/api/v1/post")
    return posts;
}