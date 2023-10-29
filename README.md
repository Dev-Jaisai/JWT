# JWT Spring Security Example

A simple example of using JSON Web Tokens (JWT) with Spring Security for user authentication and authorization.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Endpoints](#endpoints)
- [Authentication](#authentication)
- [Adding Users](#adding-users)
- [Contributing](#contributing)
- [License](#license)

## Introduction

This project demonstrates the implementation of JWT-based authentication and authorization using Spring Security. JSON Web Tokens (JWT) are used to secure RESTful APIs. 

## Features

- User authentication with JWT tokens.
- Authentication and authorization endpoints.
- User registration endpoint.
- Custom exception handling for invalid credentials.
- Basic security configurations.
- Maven project structure.

## Prerequisites

Before you begin, ensure you have met the following requirements:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) installed
- [Apache Maven](https://maven.apache.org/download.cgi) installed
- Integrated Development Environment (IDE) of your choice
- [Postman](https://www.postman.com/downloads/) or any API testing tool

## Getting Started

To get started with this project, follow these steps:

1. Clone the repository:

   ```shell
   git clone https://github.com/yourusername/jwt-spring-security.git

Open the project in your preferred IDE.

Build and run the application.

Use Postman or a similar tool to test the endpoints (see Endpoints).

Configuration
Configure your security settings in SecurityConfig.java.
Adjust JWT settings and secret key in JwtHelp.java.
Endpoints
The following endpoints are available:

/app-auth/token: POST request to authenticate and obtain a JWT token. Provide your email and password in the request body.
/app-auth/createUser: POST request to add a new user. Provide user details in the request body.
Authentication
To authenticate and obtain a JWT token, use the /auth/login endpoint. Provide your email and password in the request body. You will receive a JWT token in the response.
Adding Users
To add new users, use the /auth/add endpoint. Provide user details in the request body.
Contributing
Contributions are welcome! Please feel free to submit issues, fork the repository, and submit pull requests.
