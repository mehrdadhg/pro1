package hw3;

public class Rational {

	int sur;
	int mak;

	public Rational(int s, int m) {

		sur = s;
		mak = m;
	};

	public String toString() {
		String s = Integer.toString(this.sur);
		if (this.mak == 1) {
			return s;
		} else {
			s += "/";
			s += Integer.toString(this.mak);
			return s;
		}
	}

	public int gcm(int s, int m) {
		return m == 0 ? s : gcm(m, s % m);
	}

	public Rational asSade(int s, int m) {

		int gcm = gcm(s, m);
		return new Rational((s / gcm), (m / gcm));
	}

	public Rational add(Rational ad) {
		int s = this.sur * ad.mak + this.mak * ad.sur;
		int m = this.mak * ad.mak;
		return new Rational(s, m).asSade(s, m);
	}

	public Rational sub(Rational su) {
		int s = this.sur * su.mak - this.mak * su.sur;
		int m = this.mak * su.mak;
		return new Rational(s, m).asSade(s, m);
	}

	public Rational mul(Rational ul) {
		int s = this.sur * ul.sur;
		int m = this.mak * ul.mak;
		return new Rational(s, m).asSade(s, m);
	}

	public Rational div(Rational iv) {
		int s = this.sur * iv.mak;
		int m = this.mak * iv.sur;
		return new Rational(s, m).asSade(s, m);
	}

	public static double toFloatingPoint(Rational fp) {
		double s = fp.sur;
		double m = fp.mak;
		return s / m;
	}

	public int Sahih() {
		int s = this.sur;
		int m = this.mak;
		return s / m;
	}

	public Rational Ashar() {
		int s = this.sur - this.mak * this.Sahih();
		int m = this.mak;
		return new Rational(s, m).asSade(s, m);
	}

	public String toMakhlotString() {
		if (this.Sahih() != 0) {
			if (this.Ashar().sur != 0) {
				return this.Sahih() + "+" + this.Ashar();
			} else {
				return "" + this.Sahih() + "";
			}
		} else {
			return "this Rational has not Sahih part";
		}
	}
}