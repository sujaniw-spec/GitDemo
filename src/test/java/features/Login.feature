Feature: Application_Login

Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "sujani" and password "123"
Then Home page is populated
And Cards are displayed "true"


Scenario: Home page default login
Given User is on NetBanking landing page
When User login into application with username "john" and password "123"
Then Home page is populated
And Cards are not displayed "false"
