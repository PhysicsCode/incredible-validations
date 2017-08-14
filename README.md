# incredible-validations
Some project about validation suites for Java on top of Spring

I will be developing this on my free time (which is scarce). Anyway, let's show some insight about the project!

The main idea of the project is to reduce the time devoted in each project to perform data validation (no matter where the data origin is).
The validations are very time consuming and somehow tedious, everyone thinks that is better to generate a personal API to each project, 
nevertheless it's usually not done.

Therefore, behold the incredible-validations project.

# What could you do with incredible-validations?

At the very begining it will be possible to define validation suites for your POJOs both from annotations or through mapping xml (familiar with Hibernate? Yeah, thats similar). 

You will be able to stablish if a field should be between values, respect one (or more regex), be null (or not) [even conditionally to another field!!!]

My idea is that the code is actually agnostic to these validations, that meaning that there won't be any integrity rules that actually disallow to enter invalid values. Instead it will be possible to call a validate() function which will accept your ValidableEntity and optionally several attributes (such which validation suite to use when a single POJO should have more than one validation rules).

The output of the validation will be a CustomValidationException containing a data container filled with all the failed fields and the actual reason.



So, did you like it? Check this from time to time to see the progress!
