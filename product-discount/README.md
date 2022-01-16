# product-discount project

This project has been created to provide two services onde service work with discount and another work with like api.

### Requeriments
- Docker version 20.10.5 or major

### Setup
```
docker-compose up --build
```

### Architecture

<img src="https://github.com/ln0rd/product-discount/blob/main/doc/Architecture.png" alt="alt text" width="600">

I'm using only one database to simplify

### UML 

[Link to image](https://github.com/ln0rd/product-discount/blob/main/doc/database.md)

### Postman Documentation

[Link to Postman Documentation](https://documenter.getpostman.com/view/5267825/TzCV2jKq)


### How application works

[Link to documentation](https://github.com/ln0rd/product-discount/blob/main/doc/applicationLogical.md)

### Commits

[feat] for a new features <br>
[fix] for fix something <br>
[test] for new tests and fix them <br>
[docs] for change a document <br>
[chore] for some pre defined chore <br>
[refactor] for some refector done

Link to reference
```
https://www.conventionalcommits.org/en/v1.0.0-beta.2/
```

### About the project

Some things I did in the project and how I resolve the problem;

- I thought that the discount service doesn't need to know a product domain, just his value, so I changed it to just recieve a value about need to apply some discount;
- I worked thinking that I have two kinds of discounts, a commum discount and a special discount, a commum discount we have a range of date, and the special we don`t have one;
- When I have a special discount I need work it in the code, like birthday, because I need validate a special range of date;
- Commum discount like black friday and another one, we have a range of date, so I resolve it in the same logical to apply the discounts, in short normal discounts is dynamic, just insert in database;
- I needed to studiet a lot about Grpc, it was a news to me;
- I choose Java how my api system because the springboot and the facility about create a simple api, and because Java is a typed language, bringin more security for this delevopment;
- I had knew that --- work with nodejs in some projects I thought It would be nice show that I can create some project in the same language, the implements with grpc is very easy using nodeJs because some libs;
- I choose a sql database because I dont have a biggest necessite to work a lot of data, and as we talk about discounts we need much consistency, I think in NoSql when we need something like cache, or logs for example;
- I worked more in this respository after me job and weekends, and I liked very to work in this;
- I think that the service responsible to get user information should be other service, the discounts service doesn't need know about the user domain;
