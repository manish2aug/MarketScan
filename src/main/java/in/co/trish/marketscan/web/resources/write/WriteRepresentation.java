package in.co.trish.marketscan.web.resources.write;

public interface WriteRepresentation<DO> {
	DO convertToDomainObject();
}
