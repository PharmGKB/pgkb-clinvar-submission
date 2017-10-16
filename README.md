# PharmGKB ClinVar Submission

This is a collection of Java classes and enums that were created when converting the ClinVar XML submission schema into a JAXB-compatible package using the command:

    xjc -p org.pharmgkb.io.exporter.clinvar clinvar_submission.xsd

This resulting classes are compatible with JAXB Marshaller. For example, you could generate XML files with something similar to this:

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

This library should be updated when ClinVar updates their submission schema.

This code is maintained by [PharmGKB](https://www.pharmgkb.org) and is not supported or endorsed by NCBI or ClinVar.
