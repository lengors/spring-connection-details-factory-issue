# spring-connection-details-factory-issue

Illustration of issue when creating a custom connection details factory for docker-compose with spring devtools being used.

Displayed error when using `dev-tools`:

```log
2025-04-09T02:11:59.029+01:00  INFO 32580 --- [demo] [  restartedMain] .s.b.a.l.ConditionEvaluationReportLogger :

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-04-09T02:11:59.049+01:00 ERROR 32580 --- [demo] [  restartedMain] o.s.b.d.LoggingFailureAnalysisReporter   :

***************************
APPLICATION FAILED TO START
***************************

Description:

Parameter 0 of constructor in com.example.demo.DemoApplication required a bean of type 'com.example.demo.custom.CustomPGConnectionDetails' that could not be found.


Action:

Consider defining a bean of type 'com.example.demo.custom.CustomPGConnectionDetails' in your configuration.
```

Removing `dev-tools` dependency makes bean injection work.
