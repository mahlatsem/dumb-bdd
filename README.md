# Dumb-BDD (Dumb Behaviour Driven Development)
[![MIT licensed](https://img.shields.io/badge/license-MIT-blue.svg)](https://raw.githubusercontent.com/hyperium/hyper/master/LICENSE)
[![Coverage Status](https://coveralls.io/repos/github/mahlatsem/dumb_bdd/badge.svg?branch=master)](https://coveralls.io/github/mahlatsem/dumb_bdd?branch=master)
[ ![Codeship Status for mahlatsem/dumb_bdd](https://codeship.com/projects/18ec3e70-a8d0-0133-ff37-528fa7782574/status?branch=master)](https://codeship.com/projects/130744)

#What is BDD (Behaviour Driven Development)?
Behaviour Driven Development is a software development process from Test Driven Development (TDD), popularized by a gentleman named [Dan North](http://dannorth.net/introducing-bdd/).  
With BDD, an application is specked & designed by describing how it should behave provided certain Test input.  
Learn more about BDD from [wikipedia](https://en.wikipedia.org/wiki/Behavior-driven_development).

#Why Another BDD Tool?
There is already a [number of BDD tools](https://dzone.com/articles/brief-comparison-bdd) in existence that may be used for Java, and although these have paved the way for BDD into the Java world for many years, they do come with their own set of frustrations.  

**Out of the major BDD tools, there are 4 approaches taken in providing BDD:** 

**1.	Using the power of dynamic programming languages**  

These are the likes of [Spock](http://spockframework.org) & [EasyB](http://easyb.org/), using groovy to provide powerful DSLs. You have to introduce groovy, which is not that difficult but it is an extra added language just for testing, and depending on which IDE you use, groovy support may not be that great, otherwise these are great mature tools.

**2.	Text or HTML**
  
The likes of [JBehave](http://jbehave.org/) & [Cucumber](https://cucumber.io/) where a plain Text file may be written by none-programmers and these are mapped to Java tests by developers, so maintenance may be tricky as it becomes an overheard for developers to maintain the specification, the mapping, and the tests themselves, if you manage to figure that part out, will work great for your organization.
  
The likes of [Concordion](http://concordion.org/) use an Html based file for the specifications.

**3.	IDE Plugin based**
  
An example worth mentioning is [Jnario](http://jnario.org/) which is a fantastic well thought out Eclipse plugin (Jnario may also be used standalone). You may run into compatibility issues between the available Xtend and Jnario versions. [Xtend](http://www.eclipse.org/xtend/) is the powerful dynamic java dialect that makes all the magic Jnario does possible.
Like most BDD tools, works great with Junit, apart from the compatibility issues and just the fact that you have to install Xtend support into your IDE, only problem is if you need to run your tests via another runner, like Arquillian if you do JavaEE, you will have to go deep to write the integration work in. If you can find your way past those issues, I highly recommend trying Jnario, it is beautiful and you have been warned!

**4.	Pure Java based**
  
The Goals of these tools is to provide fluent APIs purely in Java.
My current go to Javascript BDD tool is Jasmine, and the Java BDD tools [lambda-behave](http://richardwarburton.github.io/lambda-behave/) and [oleaster](https://github.com/mscharhag/oleaster) are both inspired by Jasmine and they are similar, lambda-behave has Quickcheck like automatically generated testcases functionality and that may make a big difference to some.  
Again, they also both have their owner runners, so if you need to run your tests with another runner like Arquillian, you will have to help with that integration. They are also very developer focused which is great if you never need to share your BDD reports with other stakeholders but that is kinda of what is great about BDD, sharing BDD style reports with other stakeholders to avoid disconnect. And finally, these projects are Java 8 heavy, so you need to upgrade those legacy apps, rightfully so.
  
And finally, [JGiven](http://jgiven.org/) seems to have been inspired by the same frustrations that inspired Dumb-BDD. Apart from JGiven's greater maturity, it comes down to that subjective ease of syntax on the eyes, that is a single builder pattern lamda expressions/annonymous class vs simple methods with a couple of underscores so that the method name reads like spoken language, I personally couldn't deal with the underscores hence even after I came across this project, I liked it but I was still unsatisfied, **Again...highly subjective, that may work for you**.

Dumb-BDD also provides Test inputs in spoken language via the BDD expression/description, inspired by Jnario & JBehave.
[see example below](#how-to-use-dumb-bdd)
 
##Goals for Dumb-BDD

*   Should be so simple that no thinking should be necessary to use the tool ([see example below](#how-to-use-dumb-bdd))
*   Should Not require a special IDE plugin
*   Should Not require learning another programming language
*   Should work effortlessly with existing test frameworks (e.g. Junit, TestNG) without requiring a special runner
*   Should Not require using any particular dependency manager or build tool
*	The Tests and the Specifications should be maintained in a single place to avoid a disconnect between the two
*	Should use a realistic maintenance process, maintained by developers, then the generated reports shared with other stakeholders
*	Syntax should be intuitive to Read [subjective...**Yes!**]

#Who Is Dumb-BDD Created For?

*   One that is just starting the habit of writing tests
*   One that has heard about BDD/TDD and wants to start applying it
*   One that has been frustrated by the number of extra tools & languages he/she has had to use to get BDD going in Java
*   One that is struggling to introduce BDD/TDD to their team
*   One that has enjoyed using BDD in a dynamic programming language
*   One that is about to give up on BDD/TDD

#How To Use Dumb-BDD?
coming soon...

##Weird parts of Dumb-BDD
coming soon...

#Contribution
Pull Requests are welcome

#License
[MIT](../blob/master/LICENSE) - so use as you wish
