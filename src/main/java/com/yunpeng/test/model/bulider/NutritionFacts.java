package com.yunpeng.test.model.bulider;

/**
 *食品包装的营养成分类，使用构建器
 *当参数很多时，可能是多个相同构造器方法的重载
 * @author zhaoyunpeng
 * @version 2016-1-4 下午3:35:52
 */
public class NutritionFacts {
	//必须选项
	private final int servingSize;
	private final int serving;
	//可选选项
	private final int calories;//卡里路
	private final int fat;//脂肪
	private final int sodium;//纳
	private final int carbohydrate;//碳水化合物
	
	private NutritionFacts(Builder builder) {
		servingSize=builder.servingSize;
		serving=builder.serving;
		calories=builder.calories;
		fat=builder.fat;
		sodium=builder.sodium;
		carbohydrate=builder.carbohydrate;
	}
	public static class Builder{
		//必须选项
		private int servingSize;
		private int serving;
		//可选选项
		private int calories=0;//卡里路
		private int fat=0;//脂肪
		private int sodium=0;//纳
		private int carbohydrate=0;//碳水化合物
		
		public  Builder(int servingSize,int serving) {
			this.servingSize=servingSize;
			this.serving=serving;
		}
		
		public Builder calories(int calories){
			this.calories=calories;
			return this;
		}
		
		public Builder fat(int fat) {
			this.fat=fat;
			return this;
		}
		
		public Builder sodium(int sodium) {
			this.sodium=sodium;
			return this;
		}
		
		public Builder carbohydrate(int carbohydrate) {
			this.carbohydrate=carbohydrate;
			return this;
		}
		
		public NutritionFacts bulid(){
			return new NutritionFacts(this);
		}
		
		public static void main(String[] args) {
			NutritionFacts nutritionFacts=new NutritionFacts.Builder(240, 8).calories(40).carbohydrate(40).bulid();
			System.out.println(nutritionFacts.fat);
			System.out.println(nutritionFacts.carbohydrate);
		}
	}
}
