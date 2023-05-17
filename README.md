# Softskill Community Project

The Software Skills Community Project is about a miniature community for people who want to learn soft skills together, as well as a tool that teachers can use to teach soft skills in schools.

Everyone can participate in a video meeting and can do tasks according to the handover team leader.

The individual's rank will be increased based on the number of tasks that the individual completes.
## Features / Functionality:
- Central Authentication API - Login/Register/Forgot/Validation
- Private message
- Ranking
- Dashboard
- Communication room by video meeting
- Vote realtime to complete or cancel the mission
- Friend
- Task

## Preview:
![image](https://github.com/binhtrann/softskill-project/assets/87597562/ef8dd74f-bf41-4669-8ce9-c2b54b240167)
![image](https://github.com/binhtrann/softskill-project/assets/87597562/4f0ecb49-7836-43de-951f-d9737ddde838)
![image](https://github.com/binhtrann/softskill-project/assets/87597562/34a673c8-1dd1-401c-b7f4-c009f653cbed)
![image](https://github.com/binhtrann/softskill-project/assets/87597562/51b87cda-ec65-4f25-9592-ae5224394847)
![image](https://github.com/binhtrann/softskill-project/assets/87597562/5bc4527d-f306-4251-9f87-d724fc3fd674)
![image](https://github.com/binhtrann/softskill-project/assets/87597562/845c96a2-11d6-40a3-9fa1-797ebbac74ad)

## Technology:
- Backend: Spring Boot, Maven, JWT, Websocket, JPA, Oauth2
- Frontend: ReactJS, Socket IO, Jitsi Meet, PrimeFaces
- Database: MySQL
## Methodology & Development Tools:
- Methodology: Agile
- Development Tools: Dbeaver, Intellij, Visual Studio Code
- Communication: Discord
- Manage Tasks, Issues: Backlog

## Installation:
### Restore PostgreSQL Dump
Run `cd backend`
Then
```sh
psql database_name < dump-postgres
```
### Start backend server
After cloning the project, please type `cd backend/soft-skill-comunity` and run
```sh
mvn spring-boot:run
```
The server should be starting on port `8080`

### Start frontend client website
Run `cd fron-tend/socket` 
```sh
npm install
```
And then
```sh
npm start
```

Run `cd fron-tend` from the root folder run
```sh
npm install
```
And then
```sh
npm start
```
