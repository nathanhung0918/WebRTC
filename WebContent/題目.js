var num;
var mquestion;
var question = ["七上八下", 
"雞飛狗跳", 
"七嘴八舌",
"九牛一毛",
"一毛不拔",
"對牛彈琴",
"開懷大笑", 
"機器人",
"蜘蛛俠", 
"上廁所",
"騎腳踏車", 
"芭蕾舞", 
"化妝", 
"香蕉", 
"猴子", 
"大象", 
"毛毛蟲", 
"貓咪", 
"睡美人", 
"小紅帽", 
"烏鴉嘴", 
"青春痘", 
"找錢", 
"吹牛", 
"相機", 
"頭暈", 
"錢包", 
"掃地", 
"投降", 
"投籃", 
"游泳", 
"眨眼睛", 
"臭襪子", 
"做鬼臉", 
"救生圈", 
"溜溜球", 
"十字架", 
"刮鬍刀", 
"指甲刀", 
"冰淇淋", 
"呼拉圈", 
"洗衣服", 
"拔河比賽", 
"雨傘"];

function generate()
{
	num = Math.round(Math.random()*40);
	mquestion = qustion[num]; 
	
}
document.write(mquestion);

window.addEventListener("load",generate,false);




























