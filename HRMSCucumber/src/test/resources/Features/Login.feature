Feature: HRMS
@Login1
Scenario Outline: Login with Valid Id/Pass
Given OpenApplication
When Login With <UserName> and <Password>
And Logout
Then CloseApplication


@Login2
Scenario Outline: Login with Invalid Id
Given OpenApplication
When Login With <UserName1> and <Password>
Then CloseApplication


@Login3
Scenario Outline: Login with InValid Pass
Given OpenApplication
When Login With <UserName> and <Password1>
Then CloseApplication

@Login4
Scenario Outline: Login with InValid Id/Pass
Given OpenApplication
When Login With <UserName1> and <Password1>
Then CloseApplication

