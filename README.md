# berlin-issues-explorer-be

Backend part for **issues-explorer** project. 
This project aims to make it easier to discover opensource project issues which are suitable for beginners.

Frontend part of the project can be found [here](https://github.com/WomenWhoCode/berlin-issues-explorer-fe).
 
## Motivation for the project

Project was created to support improving of technical and collaboration skills of Women Who Code members by developing an open-source web-application together during our hack events.
With this, we want to provide learning playground for Hack Evening participants who are interested in chosen technology stack. 

## Technology stack
Programming language chosen for this project is **java** (based on interest of Hack Evening members).
 
We are building [REST API](https://www.codecademy.com/articles/what-is-rest) using [spring boot](https://projects.spring.io/spring-boot/) in order to quickly create standalone java Spring application without lots of configuration overhead. 
Our API will be serving data (about opensource projects of interest) saved in [PostgreSQL](https://www.postgresql.org/about/) database.

**Anyone who already has experience with these technologies or would like to gain it from scratch is welcome to join the project!**

## Project setup

##### Set your github account

In order to develop and contribute to this project one needs to have github account set. If you don't have one, follow [instructions](https://git-scm.com/book/en/v2/GitHub-Account-Setup-and-Configuration) and create it.
 
If you are new to using [version control](https://git-scm.com/book/en/v2/Getting-Started-About-Version-Control) it would be good that you get familiar with it, particularly with [git](https://git-scm.com/book/en/v2/Getting-Started-Git-Basics), prior to moving forward. To learn and practice basic git commands you will need, you can follow this [interactive tutorial](https://try.github.io/levels/1/challenges/1). 

##### Set your development environment

Information how to setup your development environment can be found [here](SETUP.md).

##### Run tests

After successfully setting up your environment, navigate to your project directory in terminal and run 

`gradle test` 

to run all tests in the project.

## Project walk-through

#### Goal of the project

There are a lot of opensource projects whose contributors apart from wanting to get new contributors, also want to support people to step into opensource community by providing clean guidelines on how to contribute, insisting on precise issue descriptions and labeling issues suitable for beginners by one of the following labels: `first-timers-only, up-for-grabs, newcomer, jump-in` etc.
  
**issues-explorer** project aims to display up to date overview of those issues allowing for filtering/grouping by programming language or other repository tags. 

In the next phase project should also be able to display info how much activity is happening in each repository and option to sort by most/least active ones.

####

![project components](project_overview.png)

Data about github repositories of opensource projects and currently open issues of our interest (issues which are good for beginners) should be fetched from github through github GraphQL api and stored in relational database.

Link to GitHub GraphQL API: https://developer.github.com/v4/

Bellow is an example of the query which is fetching data about issues. You can try it out at Github GraphQL API Explorer: https://developer.github.com/v4/explorer/

Place the query in the `GraphiQL` box:
```
query queryIssue($labelName: String!) {
 search( query:$labelName, type: ISSUE, last:100){
    edges{
      node{
        ... on Issue{
          id
          title
          url
          labels(last:100) {
            edges {
              node {
                name
              }
            }
          }
          repository {
            name
            url
            repositoryTopics(last:100) {
              edges {
                node{
                  topic {
                    name
                  }
                }
              }
            }
            languages(first:100) {
              edges {
                node {
                  name
                }
              }
            }
          }
        }
      }
    }
}
}
```
And variables in the `QUERY VARIABLES` box:
```
{"labelName" : "label:\"good first issue\""}
```

Our application (REST api) should serve information about those beginner friendly issues and our [frontend project](https://github.com/WomenWhoCode/berlin-issues-explorer-fe) should use our API.

App is created using [spring boot](https://projects.spring.io/spring-boot/). 

List of tasks to be tackled next is in [issues section](https://github.com/WomenWhoCode/berlin-issues-explorer-be/issues).
There is a `newcomer` label attached when issue is good for beginners.  

## Contributing

Please review our [contributing guidelines](CONTRIBUTING.md) and enjoy collaboration! 

## Have some questions or suggestions?

Please feel free to address any further questions you have about the project either at the next [Hack Evening](https://www.meetup.com/Women-Who-Code-Berlin-Germany/events/) or via email: <berlinhacknights@womenwhocode.com>


We are also welcoming any suggestions/ideas you might have about project, process of development, technology stack or how to make project onboarding easier and clearer.
