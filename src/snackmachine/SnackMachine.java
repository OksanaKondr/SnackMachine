package snackmachine;

public class SnackMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < args.length; i++) {
						switch (args[i]) {
			
						case "-h":
							System.out.println(getHelp());
							break;
							
						case "-v":
							System.out.println(getVersion());
							break;
							
						case "-makeCoffee":
							Coffee coffee = new Coffee();
							if ((i + 1) >= args.length)
								break;
							
							try {
						
								System.out.println("We made "
										+ coffee.make(Integer.parseInt(args[i + 1]))
										+ " cups of coffee");												
								i++;
							} catch (Exception ex) {
								System.out.println("We made " + coffee.make()
										+ " cup of coffee");
							}
							
							break;
						
						case "-makeToast":
							Toast toast = new Toast();
			
							if ((i + 1) >= args.length)
								break;
			
			
							try {
			
								System.out.println("We made "
										+ toast.make(Integer.parseInt(args[i + 1]))
										+ " toasts");
								i++;
							} catch (Exception ex) {
								System.out.println("We made " + toast.make() + " toast");
							}
			
							break;
			
						default:
							System.out.println("Incorrect parameter: " + args[i]);
						}
			
					}
			
				}
			
				public static String getVersion() {
					return "Version 1.1";
				}
			
				public static String getHelp() {
					return "Allowed commands:\n-v - version\n-h - help\n"
							+ "-makeCoffee <n> - makes n coffee\n"
							+ "-makeToast <n> - Makes n toasts";

	}

}
