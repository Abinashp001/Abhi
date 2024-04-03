Feature: HRMS
Scenario Outline: Add Emplyoee
Given OpenApplication
When Login With <UserName> and <Password>
And AddEmplyoee
And Logout
Then CloseApplication

Scenario Outline: Delet Epmlyoee
Given OpenApplication
When Login With <UserName> and <Password>
And SearchEmplyoee
Then DeletEmplyoee
And Logout
Then CloseApplication