Feature: Login Application

Scenario: NetBanking Login Application

Given User is on LandingPage
When User Enter the UserId and Password
Then User lands onto homePage
And Eligible Cards are displayed


Scenario: NetBanking Login Application with correct user data

Given User is on LandingPage
When User Enter the "UserId" and "Password"
Then User lands onto homePage
And Eligible Cards are displayed

Scenario: NetBanking Login Application with incorrect user data

Given User is on LandingPage
When User Enter the "UserId" and "Password"
Then User lands onto homePage
And Eligible Cards are not displayed

Scenario: NetBanking Login Application verify dashboard

Given User is on LandingPage
When User Enter the "UserId" and "Password"
Then User lands onto homePage
And Eligible Cards are displayed