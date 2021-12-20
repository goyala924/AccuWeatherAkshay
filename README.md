## Table of contents
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)

## General info
* Problem Statement
Create a test automation project that validates weather information from different sources and enables a comparison between them

* UI Layer
Use https://www.accuweather.com/ as the UI source and get weather information for any city

* API layer
Use any rest-client to automate the API listed at https://openweathermap.org/current to get current weather information for any city. Use “7fe67bf08c80ded756e598d6f8fedaea'” as the API key

* Create a comparator logic that matches the temperature information from the UI against that from the API
* Add a variance logic that returns a success if temperature difference between 2 sources is within a specified range, else return a custom exception

	
## Technologies
Project is created with:
* Java
* Selenium
* Rest Assured
	
## Setup
To run this project,

```
* Trigger Test.java
* Input -> CITY NAME
* INPUT -> CUSTOM TEMPERATURE RANGE
```
