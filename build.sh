docker build -t comment-service ./comment/
docker build -t dashboard-service ./dashboard/
docker build -t post-service ./post/
docker build -t vote-service ./vote/
docker build -t admin-service ./application-management/admin/
docker build -t eureka-service ./application-management/eureka-server/
docker build --file application-management/config/ -t config-service