package in.co.trish.marketscan.persistence.entities;

import java.io.Serializable;

public class PgInet implements Serializable {
	
	private static final long serialVersionUID = -4108963586146927571L;
	
	private String address;
	
	public PgInet() {
	}
	
	public PgInet(String s) {
		address = s;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		return result;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof PgInet))
			return false;
		PgInet other = (PgInet) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		return true;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PgInet [");
		if (address != null)
			builder.append("address=").append(address);
		builder.append("]");
		return builder.toString();
	}

	
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	
}
