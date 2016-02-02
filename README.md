# Dumb-BDD (Dumb Behaviour Driven Development)
[![MIT licensed](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/hyperium/hyper/master/LICENSE)
[![Coverage Status](https://coveralls.io/repos/github/mahlatsem/dumb_bdd/badge.svg?branch=master)](https://coveralls.io/github/mahlatsem/dumb_bdd?branch=master)
[ ![Codeship Status for mahlatsem/dumb_bdd](https://codeship.com/projects/18ec3e70-a8d0-0133-ff37-528fa7782574/status?branch=master)](https://codeship.com/projects/130744)

#What is BDD (Behaviour Driven Development)?
Behaviour Driven Development is a software development process from Test Driven Development (TDD), popularized by a gentleman named [Dan North](http://dannorth.net/introducing-bdd/).  
With BDD, an application is specked & designed by describing how it should behave provided certain Test input.  
Learn more about BDD <http://here>.

#Why Another BDD Tool?
There is already a [number of BDD tools](https://dzone.com/articles/brief-comparison-bdd) in existence that may be used for Java, and although these have paved the way for BDD into the Java world for many years, they do come with their own set of frustrations.  
Out of the major BDD tools, there are 5 approaches taken in providing BDD:

1.  Using the power of dynamic programming languages
  
These are the likes of Spock
2.  Text or HTML
3.	
3.	IDE Plugin based
  
An example worth mentioning is [Jnario](http://jnario.org/) which is a fantastic well thought out Eclipse plugin (Jnario may also be used standalone). That is until you run into compatibility issues between the available Xtend and Jnario versions. [Xtend](http://www.eclipse.org/xtend/) is the powerful dynamic java dialect that makes all the magic Jnario does possible.
Like most BDD tools, works great with Junit, apart from the compatibility issues and just the fact that you have to install Xtend, only problem is if you need to run your tests via another runner, like Arquillian if you do JavaEE, you will have to go deep to write the integration work in. If you can find your way past those issues, I highly recommend trying Jnario, it is beautiful and you have been warned!

4.	Pure Java based
  
The Goals of these tools is to go over pre Java 8 limitations to provide dynamic type fluent APIs purely in Java.
My current go to Javascript BDD tool is Jasmine, and the Java BDD tools [lambda-behave](http://richardwarburton.github.io/lambda-behave/) and [oleaster](https://github.com/mscharhag/oleaster) are both inspired by Jasmine. Unlike dumb_bdd These tools 

Dumb BDD also provides Test inputs in plain english, inspired by Jnario.
 
##Goals for Dumb BDD

*   Should be so simple that no thinking should be necessary to use the tool (see example below)
*   Should Not require a special IDE plugin
*   Should Not require learning another programming language
*   Should work effortlessly with existing test frameworks (e.g. Junit, TestNG) without requiring a special runner
*	The Tests and the Specifications should be maintained in a single place to avoid a disconnect between the two
*	Should use a realistic maintenance process, maintained by developers, then the generated reports shared with other stakeholders
*	Syntax should be intuitive to Read (subjective...**Yes!**)

#Who Is Dumb BDD Created For?

*   One that is just starting the habit of writing tests
*   One that has heard about BDD/TDD and wants to start applying it
*   One that has been frustrated by the number of extra tools & languages he/she has had to use to get BDD going in Java
*   One that is struggling to introduce BDD/TDD to their team
*   One that has enjoyed using BDD in a dynamic programming language
*   One that is about to give up on BDD/TDD

#How To Use Dumb BDD?
##Weird parts

#Contribution
Pull Requests are welcome

#License
[MIT](../blob/master/LICENSE) - so use as you wish
