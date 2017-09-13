
var el = document.getElementById("shape_type");

el.onchange = function a() {
    if (el.selectedIndex == 0){
        document.getElementById("s").value="";
        document.getElementById("r").value="";
        document.getElementById("h").disabled = false;
        document.getElementById("s").disabled = true;
        document.getElementById("r").disabled = true;
    } else if(el.selectedIndex == 1||el.selectedIndex == 2||el.selectedIndex == 3){
        document.getElementById("h").disabled = false;
        document.getElementById("s").disabled = false;
        document.getElementById("r").value="";
        document.getElementById("r").disabled = true;
    }  else if(el.selectedIndex == 4||el.selectedIndex == 5){
        document.getElementById("h").disabled = false;
        document.getElementById("s").value="";
        document.getElementById("s").disabled = true;
        document.getElementById("r").disabled = false;
    } else if(el.selectedIndex == 6){
        document.getElementById("h").value="";
        document.getElementById("h").disabled = true;
        document.getElementById("s").value="";
        document.getElementById("s").disabled = true;
        document.getElementById("r").disabled = false;
    }
}


if (el.selectedIndex == 0){
    document.getElementById("s").value="";
    document.getElementById("r").value="";
    document.getElementById("h").disabled = false;
    document.getElementById("s").disabled = true;
    document.getElementById("r").disabled = true;
} else if(el.selectedIndex == 1||el.selectedIndex == 2||el.selectedIndex == 3){
    document.getElementById("h").disabled = false;
    document.getElementById("s").disabled = false;
    document.getElementById("r").value="";
    document.getElementById("r").disabled = true;
}  else if(el.selectedIndex == 4||el.selectedIndex == 5){
    document.getElementById("h").disabled = false;
    document.getElementById("s").value="";
    document.getElementById("s").disabled = true;
    document.getElementById("r").disabled = false;
} else if(el.selectedIndex == 6){
    document.getElementById("h").value="";
    document.getElementById("h").disabled = true;
    document.getElementById("s").value="";
    document.getElementById("s").disabled = true;
    document.getElementById("r").disabled = false;
}

