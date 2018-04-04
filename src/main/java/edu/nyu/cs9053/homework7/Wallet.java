package edu.nyu.cs9053.homework7;
import java.util.*;

public class Wallet<T> implements ArrayCreator {

    private T[] array;

private int valuesInArray;

	public Wallet() {
		this.array = create(0);
		this.valuesInArray = 0;
	}

    public T[] create(int newArraySize){
        return (T[]) new Object[newArraySize];
	}

	public boolean add(T value) {
		T[] newWalletArray = create(this.valuesInArray + 1);
		if (contains(value)){
		    return false;
        }
		for (int i = 0; i < (this.valuesInArray); i++) {
			newWalletArray[i] = this.array[i];
		}
		newWalletArray[this.valuesInArray] = value;
		this.array = newWalletArray;
		this.valuesInArray += 1;
		return true;
	}

	public boolean contains(T value) {
		for (int i = 0; i < this.valuesInArray; i++) {
			if (this.array[i].equals(value)) {
				return true;
			}
		}
		return false;
	}

	public boolean remove(T value) {
		if (!contains(value)) {
            return false;
        }
		for (int i = 0; i < this.valuesInArray - 1; i++) {
			if (this.array[i].equals(value)){
				T tempHolder = this.array[i];
				this.array[i] = this.array[this.valuesInArray-1];
				this.array[this.valuesInArray-1] = tempHolder;
			}
		}
        this.array = Arrays.copyOf(this.array, this.array.length - 1);
        this.valuesInArray -= 1;
        return true;
	}

	public T get(int index) {
		try {
		    return this.array[index];
        }
        catch (IndexOutOfBoundsException E){
		    return null;
        }
	}

	public int size(){
		return this.valuesInArray;
	}
}
