Getting Started
===============

This project demonstrates a simple **STOMP over WebSocket** implementation using Spring Boot and SockJS.

It includes two frontend pages:

*   index.html – Message sender page
    
*   monitor.html – Live message monitor page
    

### Reference Documentation

For further reference, please consider the following sections:

*   [Spring Framework WebSocket Documentation](https://docs.spring.io/spring-framework/reference/web/websocket.html)
    
*   Spring Boot Reference Guide
    
*   [STOMP Protocol Specification](https://stomp.github.io/)
    
*   [SockJS Client Documentation](https://github.com/sockjs/sockjs-client)
    

### Application Access

After starting the Spring Boot application, open the following URLs:

*   Sender Pagehttp://localhost:8080/index.html
    
*   Monitor Pagehttp://localhost:8080/monitor.html
    

### WebSocket Configuration

The application is configured with the following messaging setup:

*   WebSocket Endpoint: /ws
    
*   Application Destination Prefix: /app
    
*   Message Publish Endpoint: /app/send
    
*   Topic Subscription Endpoint: /topic/messages
    
*   Protocol Used: STOMP over SockJS
    
*   Auto Reconnect Delay: 5000 ms
    

### How It Works

1.  The client connects to the WebSocket endpoint /ws.
    
2.  Messages are sent to /app/send.
    
3.  The server processes the message using @MessageMapping.
    
4.  The message is broadcast to /topic/messages.
    
5.  All subscribed clients receive the update in real-time.
    

### Troubleshooting

*   Ensure the application is running on port 8080.
    
*   Verify that @EnableWebSocketMessageBroker is configured.
    
*   Confirm correct @MessageMapping and @SendTo annotations.
    
*   Check browser console logs for connection status.
