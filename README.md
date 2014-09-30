Collection
====

## Outline

- [前言](#前言)

## 前言

### 什麼是容器（群集）？

存放物件或是屬性的地方，就之前所看到`Array`. 但是`Array`有以下缺點：

- 大小固定
- 編譯之前就必須知道切確型別

所以Java提供了一系列的工具可以使用，都在[java.util][java.util]裏。

### 簡易Demo

此部分的程式碼可以參考[DemoBasicCollection][DemoBasicCollection]。

首先我先用沒有**泛型**的方式來Demo：

```java
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		apples.add(new Apple());
		apples.add(new Orange());
		
		Apple aApple = (Apple) apples.get(0);
		System.out.println(aApple.getClass().getSimpleName() + "\t" + aApple.getId());
		
		//Here will get java.lang.ClassCastException
		//Apple bApple = (Apple) apples.get(1);
		//System.out.println(aApple.getClass().getSimpleName() + "\t" + aApple.getId());
	}
```

[java.util]: http://docs.oracle.com/javase/7/docs/api/java/util/package-summary.html
[DemoBasicCollection]: DemoBasicCollection