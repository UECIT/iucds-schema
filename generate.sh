#!/bin/bash

rm -rf src/main/java src/main/resources

# Urgent Care Report
java -cp "$XMLBEANS_ROOT"/lib/xmlbeans-3.1.0.jar org.apache.xmlbeans.impl.tool.SchemaCompiler \
  -src src/main/java -d src/main/resources -javasource 11 -verbose \
  src/main/schema/Schemas/POCD_MT000002UK01.xsd iucds_ucr.xsdconfig

# Ambulance Request
#java -cp "$XMLBEANS_ROOT"/lib/xmlbeans-3.1.0.jar org.apache.xmlbeans.impl.tool.SchemaCompiler \
#  -src src/main/java -d src/main/resources -javasource 11 -verbose \
#  src/main/schema/Schemas/REPC_MT200001GB02.xsd iucds_ar.xsdconfig

# Repeat Caller Service Query
#java -cp "$XMLBEANS_ROOT"/lib/xmlbeans-3.1.0.jar org.apache.xmlbeans.impl.tool.SchemaCompiler \
#  -src src/main/java -d src/main/resources -javasource 11 -verbose \
#  src/main/schema/Schemas/QUPA_MT000001GB01.xsd iucds_rcsq.xsdconfig

# Repeat Caller Service Response
#java -cp "$XMLBEANS_ROOT"/lib/xmlbeans-3.1.0.jar org.apache.xmlbeans.impl.tool.SchemaCompiler \
#  -src src/main/java -d src/main/resources -javasource 11 -verbose \
#  src/main/schema/Schemas/PRPA_MT000001GB01.xsd iucds_rcsr.xsdconfig

# FHIR ITK Business Acknowledgement Response
java -cp "$XMLBEANS_ROOT"/lib/xmlbeans-3.1.0.jar org.apache.xmlbeans.impl.tool.SchemaCompiler \
  -src src/main/java -d src/main/resources -javasource 11 -verbose \
  src/main/schema/ITKSchemas/ITKMessageTypes-2010-05.xsd itk.xsdconfig
