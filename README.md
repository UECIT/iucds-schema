## Generating the Java model from the schema

* Download the CDS Schema from the [NHS Connect Github](https://nhsconnect.github.io/Integrated-Urgent-Care/Publish/Domains/messages.html)
* Download the included libraries from [CDAAPI Github](https://github.com/cdaapi/cdaapi_core/tree/master/SchemaLibrary/dt)
* Download the [XMLBeans binary distribution](https://xmlbeans.apache.org/download/index.html#XMLBeans+Binary+and+Development+Kit)

```shell script
rm -rf src/main/java src/main/resources
java -cp [xmlbeans]/lib/xmlbeans-3.1.0.jar \
  org.apache.xmlbeans.impl.tool.SchemaCompiler \ 
  -src src/main/java -d src/main/resources -javasource 11 -verbose \
  [schema]/cdsxml/CDS-XML_Message_Root-V6-2-2.xsd iucds.xsdconfig
```

This will remove and regenerate all Java classes for the schema


## Licence

Unless stated otherwise, the codebase is released under [the MIT License][mit].
This covers both the codebase and any sample code in the documentation.

Contains public sector information licensed under the [Open Government Licence v3.0][ogl].

The documentation is [© Crown copyright][copyright] and available under the terms
of the [Open Government Licence v3.0][ogl].

[rvm]: https://www.ruby-lang.org/en/documentation/installation/#managers
[bundler]: http://bundler.io/
[mit]: LICENCE
[copyright]: http://www.nationalarchives.gov.uk/information-management/re-using-public-sector-information/uk-government-licensing-framework/crown-copyright/
[ogl]: http://www.nationalarchives.gov.uk/doc/open-government-licence/version/3/
