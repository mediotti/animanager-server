
# Animanager Server by [@medzdev](https://www.github.com/medzdev)

That repository stores the Animanager's serverside application. The main goal of this application is to manage the incoming and outcoming information of the whole solution.
The key responsibilities of that service:

- Deploy HTTP endpoints to create, update, read and delete medical and information records of animals, caregivers and employees of the hospital.
- Manage those informations in a persistent structured database.



## Run Locally

Clone the project

```bash
  git clone https://github.com/medzdev/animanager-server
```

Go to the project directory

```bash
  cd animanager-server
```

Build locally

```bash
  docker build --tag=animanager-server:latest .
```

Run the image in a container

```bash
  docker run --publish 8080:8080 animanager-server
```


## API Reference

#### Get all information records stored in the database.

```http
  GET /animanager/information_records
```

#### Get item

```http
  GET /api/items/${id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `UUID` | **Required**. Id of an individual information record to fetch |


#### Post item

```http
  POST /api/items/${id}
```

| Parameter | Type     | Description(All of them are **Required**                   |
| :-------- | :------- | :-------------------------------- |
| `record_role`| `String(Enum)` | That attribute stores an enum, only accepting `EMPLOYEE` or `CAREGIVER` as a valid value |
| `first_name`| `String` | That attribute should receive the person's first name  |
| `last_name`| `String` | That attribute should receive the person's surname  |
| `phone_number`| `String` | That attribute should receive the person's contact phone number  |
| `ssn`| `String` | That attribute should receive the person's social security number  (SSN), for Brazilians, it should store the CPF number  |
| `zip_code`| `String` | That attribute should receive the person's home postal code  |
| `address_complements`| `String` | That attribute should receive the person's home additional information, such as house number, unit, building, etc.  |
