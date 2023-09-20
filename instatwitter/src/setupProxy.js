const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function (app) {
    console.log("===================createProxyMiddleware start===============================")
    app.use(
        '/api/v1/post',
        createProxyMiddleware({
            target: 'http://localhost:8080',
            changeOrigin: true,
        })
    );
    app.use(
        '/api/v1/comment',
        createProxyMiddleware({
            target: 'http://localhost:8081',
            changeOrigin: true,
        })
    );
    console.log("===================createProxyMiddleware end===============================")

};