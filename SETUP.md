
# Setup development environment

First, if you don't already have it - create github account at [github](https://github.com) to be able to contribute to the project.

## Setup IDE (Integrated Development Environment)
  
For developing java projects it is very helpful to have IDE setup. You can either **setup IDE locally** or use **cloud IDE** which you can access from your browser. 

In case that you are not developing in java in general and want to have a quick look into the project, cloud IDE would be suitable as you can have it up and running quickly.
If, however, you want to be more involved in java ecosystem, it would be good that you go through installation process and have your local environment set up.

#### Run and build project locally

#### installation 

  * install java8 ([link](https://docs.oracle.com/javase/8/docs/technotes/guides/install/install_overview.html))
  * install gradle build tool ([link](https://gradle.org/install/))
  * install git ([link](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git))
  * install/upgrade your favorite IDE ([intellij](https://www.jetbrains.com/help/idea/installing-and-launching.html)/[eclipse](http://www.eclipse.org/downloads/))
  
#### setup your fork of the project   
  * fork the project by clicking on "**Fork**" button in the upper right corner of the project [github page](https://github.com/WomenWhoCode/berlin-issues-explorer-be)
  * clone your fork of the project through command line 
    * once you clicked on "**Fork**" button, you are led to your fork of the project (listed in your list of repositories within your github account). 
    
      There, in upper right corner there is a "**Clone or download**" button which if you click you see url to use when cloning
    * type in terminal, at the place where you want project to be stored 
    
      `git clone <URL from previous step>` 
    
      it will look like:
    
      `git clone https://github.com/<your user name>/berlin-issues-explorer-be.git`

#### build and run project locally   
  * open project (directory) you have just cloned in your IDE. Build it and run from terminal (being positioned inside project directory) with:  
  
    `gradle build && java -jar build/libs/berlin-issues-explorer-be-0.1.0.jar`


## Add  GITHUB_ACCESS_TOKEN

You can find your token at https://github.com/settings/tokens. Then run the following command in the terminal with your token. < and > are not part of the actual token.

    export GITHUB_ACCESS_TOKEN=<Your Token Here>>

You can use 'printenv' to check if it worked. If you run Spring from your IDE, don't forget to explicitly include the environment variable and its value in your run configuration.
