CREATE TABLE QUESTIONS (
	ID_QUESTION SERIAL PRIMARY KEY,
	BODY_QUESTION VARCHAR(200) NOT NULL
);

CREATE TABLE ANSWERS (
	ID_ANSWER SERIAL PRIMARY KEY,
	BODY_ANSWER VARCHAR(200) NOT NULL,
	ID_QUESTION INTEGER REFERENCES QUESTIONS (ID_QUESTION),
	CORRECT_ANSWER BOOLEAN NOT NULL
);

CREATE TABLE USERS (
	ID_USER SERIAL PRIMARY KEY,
	SURNAME VARCHAR(50) NOT NULL,
	NAME VARCHAR(50) NOT NULL,
	MIDDLE_NAME VARCHAR(50)
);

CREATE TABLE QUESTIONS_ANSWERED_BY_THE_USER (
	ID_USER INTEGER REFERENCES USERS (ID_USER),
	ID_QUESTION INTEGER REFERENCES QUESTIONS (ID_QUESTION),
	ID_ANSWER INTEGER REFERENCES ANSWERS (ID_ANSWER)
);

INSERT INTO QUESTIONS (BODY_QUESTION)
VALUES ('Сколько ног у собаки');

INSERT INTO ANSWERS (BODY_ANSWER, ID_QUESTION, CORRECT_ANSWER)
VALUES
(4,(SELECT ID_QUESTION FROM QUESTIONS WHERE BODY_QUESTION = 'Сколько ног у собаки'), TRUE),
(3,(SELECT ID_QUESTION FROM QUESTIONS WHERE BODY_QUESTION = 'Сколько ног у собаки'), FALSE),
(2,(SELECT ID_QUESTION FROM QUESTIONS WHERE BODY_QUESTION = 'Сколько ног у собаки'), FALSE),
(1,(SELECT ID_QUESTION FROM QUESTIONS WHERE BODY_QUESTION = 'Сколько ног у собаки'), FALSE)
;

INSERT INTO USERS (SURNAME, NAME)
VALUES('Petrov','Petr');

INSERT INTO QUESTIONS_ANSWERED_BY_THE_USER (ID_USER, ID_QUESTION, ID_ANSWER)
VALUES (
		(SELECT ID_USER FROM USERS WHERE SURNAME = 'Petrov' AND NAME = 'Petr'),
		(SELECT ID_QUESTION FROM QUESTIONS WHERE BODY_QUESTION = 'Сколько ног у собаки'),
		(SELECT ID_ANSWER FROM ANSWERS WHERE BODY_ANSWER = '4')
	);

SELECT
SURNAME||' '||NAME AS FULL_NAME, q.BODY_QUESTION, an.BODY_ANSWER, an.CORRECT_ANSWER
FROM USERS
JOIN QUESTIONS_ANSWERED_BY_THE_USER qa ON qa.ID_USER = USERS.ID_USER
JOIN QUESTIONS q ON q.ID_QUESTION = qa.ID_QUESTION
JOIN ANSWERS an ON an.ID_ANSWER = qa.ID_ANSWER