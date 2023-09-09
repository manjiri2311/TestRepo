Feature: Submit the Form
Scenario: Submit the Holiday form
Given Laundh Site
When Click on Holidays button
And Enter Destination
And Enter Start Date
And Chosse Duration
And Choose type of Holiday
And Click on Search Holidays button
Then Search result should be displayed
