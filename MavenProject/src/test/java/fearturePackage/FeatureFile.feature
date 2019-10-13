Feature: Leaptaps CretaeLead Test

Background:
Given Open the Chrome Browser
And Maximise the browser window
And Set the timeouts
And Load the URL
And Enter UserName as democsr
And Enter password as crmsfa
And Click Login
And Click CRMFSA link 

Scenario Outline: TC001 Verify Basic Create Lead Function

And Click Create Lead
And Enter Company Name as <cName>
And Enter FirstName as <fName>
And Enter LastName as <lName>
When Click Create Leads Button
Then Verify lead is created successfully for <fName>

Examples:
| cName | fName | lName |
| Company Name one | Priyaa | Selvaraj |
| Company Name two | abc | def |
| Company Name three | Mervinn | Jude |