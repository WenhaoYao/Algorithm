/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: package-info.java 
 * @Prject: Algorithm
 * @Package: 排队接水 
 * @Description: TODO
 * @author: YaoWenHao   
 * @date: 2019年2月6日 下午9:02:01 
 * @version: V1.0   
 */
/** 
 * @ClassName: package-info 
 * @Description: TODO
 * @author: YaoWenHao
 * @date: 2019年2月6日 下午9:02:01  
 */
package 排队接水;

/*题目描述
有n个人在一个水龙头前排队接水，假如每个人接水的时间为Ti，请编程找出这n个人排队的一种顺序，使得n个人的平均等待时间最小。

输入输出格式
输入格式：
输入文件共两行，第一行为n；第二行分别表示第1个人到第n个人每人的接水时间T1，T2，…，Tn，每个数据之间有1个空格。

输出格式：
输出文件有两行，第一行为一种排队顺序，即1到n的一种排列；第二行为这种排列方案下的平均等待时间(输出结果精确到小数点后两位)。

输入输出样例
输入样例#1： 
10 
56 12 1 99 1000 234 33 55 99 812
输出样例#1： 
3 2 7 8 1 4 9 6 10 5
291.90
说明
n<=1000

ti<=1e6，不保证ti不重复

当ti重复时，按照输入顺序即可（sort是可以的）*/