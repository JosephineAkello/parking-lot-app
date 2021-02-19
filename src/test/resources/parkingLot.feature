Feature: Testing valid GET endpoint
Given url 'http://localhost:8081/aboutme'
When method GET
Then status 200
And match $ == {age:10",name:"Jos",skills:"Java -Spring"}
