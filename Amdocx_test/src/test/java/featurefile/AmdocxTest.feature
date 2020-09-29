Feature: AmmdocTest
Scenario: Verify Some Scenarios
Given User Launch browser--
And User Open Url "https://phptravels.net/"
Then User validate homePage Title as "PHPTRAVELS | Travel Technology Partner"
And user click on Myaccount button
And User select Sign up Option by clicking on it
And User verify the Sign Up page by this Url "https://phptravels.net/register"
Then User provide the sign Up details