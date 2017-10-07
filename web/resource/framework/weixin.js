
if(window.location.href.indexOf("#") == -1){
    console.log("第一次进入页面,清除缓存数据");
    setLocalData({});
}


function gotoPage(url){
    location.assign("#");
    location.href = url + "#";
}

function getPageState(){
    var pageState = window.localStorage.getItem("publink-pageState")
}


function getLocalData(){
    var data = JSON.parse(window.localStorage.getItem("publink-localdata"));
    console.log("本地数据");
    console.log(data);
    return data;
}

function setLocalData(data){
    window.localStorage.removeItem("publink-localdata");
    window.localStorage.setItem("publink-localdata", JSON.stringify(data));
}
