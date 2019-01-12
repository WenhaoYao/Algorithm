/**  
 * Copyright © 2019公司名字. All rights reserved.
 *
 * @Title: package-info.java
 * @Prject: Algorithm
 * @Package: 斯诺登的密码
 * @Description: TODO
 * @author: yaowenhao  
 * @date: 2019年1月11日 下午8:15:50
 * @version: V1.0  
 */
/**
 * @ClassName: package-info
 * @Description: TODO
 * @author: yaowenhao
 * @date: 2019年1月11日 下午8:15:50
 */
package 斯诺登的密码;

/*题目描述

2013年X月X日，俄罗斯办理了斯诺登的护照，于是他混迹于一架开往委内瑞拉的飞机。但是，这件事情太不周密了，因为FBI的间谍早已获悉他的具体位置——但这不是最重要的——最重要的是如果要去委内瑞拉，那么就要经过古巴，而经过古巴的路在美国的掌控之中。

丧心病狂的奥巴马迫降斯诺登的飞机，搜查时却发现，斯诺登杳无踪迹。但是，在据说是斯诺登的座位上，发现了一张纸条。纸条由纯英文构成：Obama is a two five zero.（以"."结束输出，只有6个单词+一个句号，句子开头如没有大写亦为合法）这句话虽然有点无厘头，但是警官陈珺骛发现这是一条极其重要的线索。他在斯诺登截获的一台笔记本中找到了一个C++程序，输入这条句子后立马给出了相对应的密码。陈珺鹜高兴得晕了过去，身为警官的你把字条和程序带上了飞机，准备飞往曼哈顿国际机场，但是在飞机上检查的时候发现——程序被粉碎了！飞机抵达华盛顿只剩5分钟，你必须在这5分钟内编写（杜撰）一个程序，免受上司的10000000000%10大板。破译密码的步骤如下：

（1）找出句子中所有用英文表示的数字(≤20)，列举在下：

正规：one two three four five six seven eight nine ten eleven twelve thirteen fourteen fifteen sixteen seventeen eighteen nineteen twenty

非正规：a both another first second third

（2）将这些数字平方后%100，如00,05,11,19,86,99。

（3）把这些两位数按数位排成一行，组成一个新数，如果开头为0，就去0。

（4）找出所有排列方法中最小的一个数，即为密码。

// 数据已经修正 By absi2011 如果还有问题请联系我

输入输出格式
输入格式：
一个含有6个单词的句子。

输出格式：
一个整型变量（密码）。如果没有符合要求的数字出现，则输出0。

输入输出样例
输入样例#1： 
Black Obama is two five zero .
输出样例#1： 
425*/