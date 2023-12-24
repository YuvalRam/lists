public static boolean q8(IntNode L1, IntNode L2) {
		return q8r(L1,L2,L2);
	}
	public static boolean q8r(IntNode L1, IntNode L2, IntNode L2First) {
		if(L1!=null && L2!=null) {
			if(L1.getValue()==L2.getValue())
				return q8r(L1.getNext(),L2First,L2First);
			return q8r(L1,L2.getNext(),L2First);
		}
		if(L1==null)
			return true;
		return false;
	}
