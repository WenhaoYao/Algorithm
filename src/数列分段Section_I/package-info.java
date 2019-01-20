/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: package-info.java 
 * @Prject: Algorithm
 * @Package: 数列分段Section_I 
 * @Description: TODO
 * @author: YaoWenHao   
 * @date: 2019年1月20日 上午11:16:03 
 * @version: V1.0   
 */
/** 
 * @ClassName: package-info 
 * @Description: TODO
 * @author: YaoWenHao
 * @date: 2019年1月20日 上午11:16:03  
 */
package 数列分段Section_I;

/*题目描述
对于给定的一个长度为NN的正整数数列A_iA 
i
​	 ，现要将其分成连续的若干段，并且每段和不超过MM（可以等于MM），问最少能将其分成多少段使得满足要求。

输入输出格式
输入格式：
第1行包含两个正整数N,MN,M，表示了数列A_iA 
i
​	 的长度与每段和的最大值，第22行包含NN个空格隔开的非负整数A_iA 
i
​	 ，如题目所述。

输出格式：
一个正整数，输出最少划分的段数。

输入输出样例
输入样例#1： 
5 6
4 2 4 5 1
输出样例#1： 
3
说明
对于20\%20%的数据，有N≤10N≤10；

对于40\%40%的数据，有N≤1000N≤1000；

对于100\%100%的数据，有N≤100000,M≤10^9N≤100000,M≤10 
9
 ，MM大于所有数的最小值，A_iA 
i
​	 之和不超过10^910 
9
 。

将数列如下划分：

[4][2 4][5 1][4][24][51]
第一段和为44，第22段和为66，第33段和为66均满足和不超过M=6M=6，并可以证明33是最少划分的段数。*/