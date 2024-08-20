package modulo_14;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Aula163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String flag = "y";
		List<Product> products = new ArrayList<>();
		do {
			System.out.println("Enter the type of product: ");
			try {
				Product cls = getProduct(sc.next());

				System.out.printf("\nClass: %s\n", cls.getClass().getSimpleName());
				
				Arrays.stream(cls.getClass().getDeclaredMethods()).forEach(method -> {
					if (method.getName().contains("set")) {
						System.out.printf("%s:\n", method.getName());

						Arrays.stream(method.getParameters()).forEach(par -> {

							System.out.printf("Parameter %s:\n", par.getType().getSimpleName());

							try {
								String scanMethod = "next" + par.getType().getSimpleName();

								System.out.println("metodo : " + scanMethod);

								if (Arrays.stream(sc.getClass().getMethods())
										.anyMatch(t -> t.getName().contains(scanMethod))) {
									Method mt = Scanner.class.getMethod(scanMethod);

									Object res = mt.invoke(sc);

									System.out.println(res.toString());

									method.invoke(cls, res);

								} else {
									Object res = sc.next();

									System.out.println(res.toString());

									method.invoke(cls, res);
								}

							} catch (Exception e) {
								e.printStackTrace();
							}

						});

					}

				});
				products.add(cls);

			} catch (Exception e) {
				System.err.println(e);
			}
			System.out.println("Enter more products? y/n ");
			flag = sc.next();

		} while (flag.matches("y"));

		sc.close();
	}

	private static Product getProduct(String typ) {
		switch (typ) {
		case "c": {
			return new Product();
		}
		case "i": {
			return new ImportedProduct();
		}
		case "u": {
			return new UsedProduct();
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + typ);
		}
	}
}
