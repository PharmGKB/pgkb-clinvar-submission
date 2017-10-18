# PharmGKB ClinVar Submission Library

[![Build Status](https://travis-ci.org/PharmGKB/pgkb-clinvar-submission.svg?branch=master)](https://travis-ci.org/PharmGKB/clinvar-submission)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/org.pharmgkb/pgkb-clinvar-submission/badge.svg)](https://maven-badges.herokuapp.com/maven-central/org.pharmgkb/pgkb-clinvar-submission)
[ ![Download](https://api.bintray.com/packages/pharmgkb/maven/pgkb-clinvar-submission/images/download.svg) ](https://bintray.com/pharmgkb/maven/pgkb-clinvar-submission/_latestVersion)

This is a collection of Java classes and enums that were created when converting the ClinVar XML submission schema into a JAXB-compatible package using the command:

```commandline
xjc -p org.pharmgkb.io.exporter.clinvar clinvar_submission.xsd
```

This resulting classes are compatible with JAXB Marshaller. For example, you can generate XML files with something similar to this:

```java
private void writeSubmissionFile(Path filePath) throws JAXBException {

    JAXBContext context = JAXBContext.newInstance(SubmissionSetType.class);
    Marshaller marshaller = context.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

    ObjectFactory objectFactory = new ObjectFactory();
    marshaller.marshal(objectFactory.createClinvarSubmissionSet(makeSubmission()), filePath.toFile());
}
```

The XML Schema document can be found on [the NCBI FTP server in the ClinVar folder](ftp://ftp.ncbi.nlm.nih.gov/pub/clinvar/clinvar_submission.xsd).

This library should be updated when ClinVar updates their submission schema.  The major/minor version numbers of this library will match ClinVar's submission schema's version.

This code is maintained by [PharmGKB](https://www.pharmgkb.org) and is neither supported nor endorsed by NCBI or ClinVar.
