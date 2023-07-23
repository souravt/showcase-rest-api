## Building showcase REST API

- [x]  Building a simple Ping/Pong
- [ ] Connect with DB
- [ ] Invoke external service
- [ ] Connect with Kafka
- [ ] Connect with Redis
- [ ] Logging
- [ ] Error Handling
- [ ] Connect with observability agents
- [ ] Containerize
- [ ] Add code quality checkers
- [x] Add unit test cases

## How to Test?

### Sending a GET message

```
curl http://localhost:8081/ping
```

### Sending a POST message

```
curl --location 'http://localhost:8081/messages' \
--header 'Content-Type: application/json' \
--data '{"message":"Welcome"}'
```
