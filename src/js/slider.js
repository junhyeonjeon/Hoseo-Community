// 프리미엄 게시글 슬라이더

$(function() {
	var li_ele = $("#t li");
	var li_w = $("#t li").width() + 22;
	var leftGo = "-=";
	var rightGo = "+="
	var infinite;
	var rolling;
	// auto play
	function loopObj(behavior) {
		infinite = setInterval(function() {
			$("#t ul").animate({
				left : behavior + li_w,
			}, "slow", function() {
				var frst = $("#t ul li:first-child")
				$("#t ul").append(frst)
				$("#t ul").css("left", "0%");
			});
		}, 2000);
	}
	function loopObj2(behavior, btns) {
		rolling = setTimeout(function() {
			$("#t ul").animate({
				left : behavior + li_w,
			}, "fast", function() {
				var frst = $("#t ul li:first-child");
				var last = $("#t ul li:last-child");
				if (btns == "next") {
					$("#t ul").append(frst)
				}
				if (btns == "prev") {
					$("#t ul").prepend(last)
				}
				$("#t ul").css("left", "0%");
			});
		}, 0);
	}
	loopObj(leftGo)
	
	// custom play
	$(".pl3").mouseover(function() {
		clearInterval(infinite);
	}).mouseout(function() {
		clearInterval(infinite);
		loopObj(leftGo);
	});

	$("button").click(function() {
		var btns = $(this).text();
		switch (btns) {
		case "◀ PREV":
			clearInterval(infinite);
			loopObj2(rightGo, "prev");
			loopObj(leftGo);
			break;
		case "NEXT ▶":
			clearInterval(infinite);
			loopObj2(leftGo, "next");
			loopObj(leftGo);
			break;
		/*case "auto":
			clearInterval(infinite);
			loopObj(leftGo);
			break;
		case "stop":
			clearInterval(infinite);
			break;*/
		}
	})
})