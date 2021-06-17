package com.selenium.allclass;

public enum DEnumSelectType {
	INDEX {
		@Override
		public String toString() {
			return "index";
		}
	},
	VALUE {
		@Override
		public String toString() {
			return "value";
		}
	},
	VISIBLETEXT {
		@Override
		public String toString() {
			return "visibletext";
		}
	},
}
