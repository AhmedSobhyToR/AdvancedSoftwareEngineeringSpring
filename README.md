# Advanced Software Phase2
Our IDS are: 20200681 20201083 20200368 20200020
Fjdj
1.	DataBase: H2 Spring Boot DataBase which save the data on the filesystem 
2.	IDE: We have built the project on Intellij IDE 
3.	Java Version: 17 

Notes: 
1.	We handled the request status so when you made inappropriate action you will get the response that this action is unacceptable, or no content have been found 

Steps For Running the Application: 
1.	We have initialized some data for the database so you don’t have to insert all the data manually you will find this data on the config file which uses command liner function this function.
2.	Please note that admin user is the account with the id 1 
3.	The application is working exactly as the requirements 
4.	The only confusing point is the provider which contain the following steps
a.	The user is sending the provider id, amount, form 
b.	The provider handles this form and return the required amount of money 
c.	The user sends those amounts of money into the provider by his id 
d.	A Payment Transaction has been created.
5.	Any Action like pay with wallet if their insufficient amount of money then this action will not be accepted and you will got a status code with that so you have to care about your validation of you inputs, anyway those exceptions would be handled
