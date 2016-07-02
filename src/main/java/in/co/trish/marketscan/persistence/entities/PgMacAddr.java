package in.co.trish.marketscan.persistence.entities;

import java.io.Serializable;

public class PgMacAddr implements Serializable {
	
	
	private static final long serialVersionUID = -9221895124240824676L;
	
	private String macAddress;
	
	public PgMacAddr() {
	}
	
	public PgMacAddr(String s) {
		macAddress = s;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PgMacAddr [");
		if (macAddress != null)
			builder.append("macAddress=").append(macAddress);
		builder.append("]");
		return builder.toString();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((macAddress == null) ? 0 : macAddress.hashCode());
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
		if (!(obj instanceof PgMacAddr))
			return false;
		PgMacAddr other = (PgMacAddr) obj;
		if (macAddress == null) {
			if (other.macAddress != null)
				return false;
		} else if (!macAddress.equals(other.macAddress))
			return false;
		return true;
	}

	/**
	 * @return the address
	 */
	public String getMacAddress() {
		return macAddress;
	}
	
}
