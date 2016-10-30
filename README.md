# serverless-crud-scala
Serverless Crud Service in Scala which provides a basic CRUD scaffold - http://serverless.com

## Installation

Make sure that you use Serverless v1.

1. Run `serverless install --url https://github.com/jahangirmohammed/serverless-crud-scala` to install the service in your current working directory
2. Next up cd into the service with `cd serverless-crud-scala`
3. Run `npm install`
4. Ensure you have set up required credentials as described [here](https://github.com/serverless/serverless/blob/master/docs/providers/aws/guide/credentials.md)
5. Deploy with `serverless deploy`. You will see the service information displayed.

## How to use

Simply perform requests against the exposed endpoints:

### Create

```
curl -X POST https://XXXX.execute-api.region.amazonaws.com/dev/todos --data '{ "body" : "Learn Serverless" }'
```

### Read all


```
curl https://XXXX.execute-api.region.amazonaws.com/dev/todos
```

### Read one

```
curl https://XXXX.execute-api.region.amazonaws.com/dev/todos/<id>
```

### Update

```
curl -X PUT https://XXXX.execute-api.region.amazonaws.com/dev/todos/<id> --data '{ "body" : "Understand Serverless" }'
```

### DELETE

```
curl -X DELETE https://XXXX.execute-api.region.amazonaws.com/dev/todos/<id>
```

## AWS services used

- Lambda
- API Gateway
- DynamoDB
