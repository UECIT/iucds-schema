## Generating the Java model from the schema

* Download the CDS Schema from the [NHS Connect Github](https://github.com/nhsconnect/Integrated-Urgent-Care)
  * Description of schema files is located on [a github.io page](https://nhsconnect.github.io/Integrated-Urgent-Care/Publish/Domains/messages.html) (published from the above repo)
* Download the [XMLBeans binary distribution](https://xmlbeans.apache.org/download/index.html#XMLBeans+Binary+and+Development+Kit)

```shell script
XMLBEANS_ROOT=[xmlbeans_root] ./generate.sh
```

This will remove and regenerate all Java classes for the schema


## Licence

Unless stated otherwise, the codebase is released under [the MIT License][mit].
This covers both the codebase and any sample code in the documentation.

The XSD Schemas included here are licensed under [the Apache License 2.0][apache2]

Contains public sector information licensed under the [Open Government Licence v3.0][ogl].

The documentation is [© Crown copyright][copyright] and available under the terms
of the [Open Government Licence v3.0][ogl].

[mit]: LICENSE-MIT
[apache2]: LICENSE-APACHE2
[copyright]: http://www.nationalarchives.gov.uk/information-management/re-using-public-sector-information/uk-government-licensing-framework/crown-copyright/
[ogl]: http://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/
