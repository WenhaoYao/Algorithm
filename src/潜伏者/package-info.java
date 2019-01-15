/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: package-info.java 
 * @Prject: Algorithm
 * @Package: 潜伏者 
 * @Description: TODO
 * @author: YaoWenHao   
 * @date: 2019年1月15日 下午12:26:31 
 * @version: V1.0   
 */
/** 
 * @ClassName: package-info 
 * @Description: TODO
 * @author: YaoWenHao
 * @date: 2019年1月15日 下午12:26:31  
 */
package 潜伏者;

/*题目描述
R R国和 S S国正陷入战火之中，双方都互派间谍，潜入对方内部，伺机行动。历尽艰险后，潜伏于 S S国的 RR 国间谍小 C C终于摸清了 SS 国军用密码的编码规则：

1． S S国军方内部欲发送的原信息经过加密后在网络上发送，原信息的内容与加密后所得的内容均由大写字母‘AA’-‘ZZ’构成（无空格等其他字符）。

2． S S国对于每个字母规定了对应的“密字”。加密的过程就是将原信息中的所有字母替换为其对应的“密字”。

3． 每个字母只对应一个唯一的“密字”，不同的字母对应不同的“密字”。“密字”可以和原字母相同。

例如，若规定‘AA’的密字为‘AA’，‘BB’的密字为‘CC’（其他字母及密字略），则原信息“ABAABA”被加密为“ACAACA”。

现在，小 CC 通过内线掌握了 SS 国网络上发送的一条加密信息及其对应的原信息。小 CC希望能通过这条信息，破译 SS 国的军用密码。小 CC 的破译过程是这样的：扫描原信息，对于原信息中的字母 xx（代表任一大写字母），找到其在加密信息中的对应大写字母 yy，并认为在密码里 y y是 x x的密字。如此进行下去直到停止于如下的某个状态：

1． 所有信息扫描完毕，‘AA’-‘ZZ’ 所有 26 26个字母在原信息中均出现过并获得了相应的“密字”。

2． 所有信息扫描完毕，但发现存在某个（或某些）字母在原信息中没有出现。

3． 扫描中发现掌握的信息里有明显的自相矛盾或错误（违反 SS 国密码的编码规则）。例

如某条信息“XYZXYZ”被翻译为“ABAABA”就违反了“不同字母对应不同密字”的规则。

在小 CC 忙得头昏脑涨之际，RR 国司令部又发来电报，要求他翻译另外一条从 S S国刚刚截取到的加密信息。现在请你帮助小 CC：通过内线掌握的信息，尝试破译密码。然后利用破译的密码，翻译电报中的加密信息。

输入输出格式
输入格式：
共 3 3行，每行为一个长度在 1 1到 100 100之间的字符串。

第 11 行为小 CC 掌握的一条加密信息。

第 22 行为第 11 行的加密信息所对应的原信息。

第 3 3行为 R R国司令部要求小 CC 翻译的加密信息。

输入数据保证所有字符串仅由大写字母‘AA’-‘ZZ’构成，且第 1 1行长度与第 2 2行相等。

输出格式：
共 11 行。

若破译密码停止时出现 2,32,3 两种情况，请你输出“FailedFailed”（不含引号，注意首字母大

写，其它小写）。

否则请输出利用密码翻译电报中加密信息后得到的原信息。

输入输出样例
输入样例#1： 
AA 
AB 
EOWIE

输出样例#1： 
Failed
输入样例#2： 
QWERTYUIOPLKJHGFDSAZXCVBN 
ABCDEFGHIJKLMNOPQRSTUVWXY 
DSLIEWO
输出样例#2： 
Failed 
输入样例#3： 
MSRTZCJKPFLQYVAWBINXUEDGHOOILSMIJFRCOPPQCEUNYDUMPP
YIZSDWAHLNOVFUCERKJXQMGTBPPKOIYKANZWPLLVWMQJFGQYLL
FLSO 
输出样例#3： 
NOIP
说明
【输入输出样例 1 1说明】

原信息中的字母‘AA’和‘BB’对应相同的密字，输出“FailedFailed”。

【输入输出样例 2 2说明】

字母‘ZZ’在原信息中没有出现，输出“FailedFailed”。*/