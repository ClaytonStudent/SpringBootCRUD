# SpringBootCRUD


## 1. Introduction

A Spring Boot application provides basic CRUD of Employee. 

This is a hands-on project implementation of Video tutorial of Spring Boot by ShangGuigu: https://www.youtube.com/playlist?list=PLmOn9nNkQxJEFsK2HVO9-WA55Z7LZ2N0S


## 2. Configuration
Java 14

Spring Boot 2.3.1

Spring Boot Web 2.3.1

Apache Maven 3.6.3

lombok 0.30

thymeleaf 3.0.11

jquery 3.3.1

bootstrap 4.0.0


## 3. Main Structure 

#### 3.1. component
LoginHandlerInterceptor : login interceptor: go on if valid login information, reject if not success.

MyLocaleResolver: International login information.

#### 3.2. config
MyMvcConfig: redirect url request to default urlPath, set default Interceptors

#### 3.3. controller
It is the management service scheduling and url jump, deal with all HTTP mapping

#### 3.4. dao
data access object. Encapsulating the details of the persistence layer and provide a CRUD interface for a single entity.
It includes DepartmentDao and EmployeeDao.

#### 3.5. entities
Entity class of database table, define class Employee and Department 

## 4. Functionality

default icon

login checking

interceptor

international login interface

CRUD operation of database along with web interface

RESTful web



