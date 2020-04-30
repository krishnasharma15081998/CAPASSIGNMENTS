package krishna.cap.gla.spring.exception;



	public class ProductException extends RuntimeException{

		/**
		 *
		 */
		private static final long serialVersionUID = 1L;

		public ProductException(String info) {
			super(info);
			// TODO Auto-generated constructor stub
		}

		public ProductException() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ProductException(String info, Throwable source, boolean enableSuppression, boolean writableStackTrace) {
			super(info, source, enableSuppression, writableStackTrace);
			// TODO Auto-generated constructor stub
		}

		public ProductException(String info, Throwable source) {
			super(info, source);
			// TODO Auto-generated constructor stub
		}

		public ProductException(Throwable source) {
			super(source);
			// TODO Auto-generated constructor stub
		}

	}

