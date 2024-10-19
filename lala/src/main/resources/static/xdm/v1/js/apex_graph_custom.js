var options1 = {
	chart: {
		width: 400,
		type: 'pie',
	},
	series: [25, 15, 44, 55, 58],
	labels: ["행정,서류", "세무", "교통", "불편사항", "기타"],
	theme: {
		monochrome: {
			enabled: true,
			color: '#435EEF',
		}
	},
	// title: {
	// 	text: "Weekly Sales",
	// },
	responsive: [{
		breakpoint: 480,
		options: {
			chart: {
				width: 200
			},
			legend: {
				position: 'bottom'
			}
		}
	}],
	stroke: {
		width: 0,
	},
}
var options2 = {
    chart: {
        height: 300,
        type: 'radialBar',
        toolbar: {
            show: false,
        },
    },
    title: {
		text: "※민원",
	},
    plotOptions: {
        radialBar: {
            dataLabels: {
                name: {
                    fontSize: '12px',
                    fontColor: 'black',
            fontFamily: 'Merriweather',
                },
                value: {
                    fontSize: '21px',
                    fontFamily: 'Merriweather',
                },
                total: {
                    show: true,
                    label: '민원 종류',
                    formatter: function (w) {
                        // series의 총합 계산
                        const sum = w.globals.series.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
                        console.log("총합:"+sum)
                        return sum+"건"; // 총합 반환
                    }
                }
            }
        }
    },
    series: [25, 15, 44, 55, 58],
    labels: ["행정,서류", "세무", "교통", "불편사항", "기타"],
    colors: ['#4267cd', '#32b2fa', '#f87957', '#8e44ad', '#2e8b57'],
}
// var options2 = {
// 	chart: {
// 		width: 400,
// 		type: 'pie',
// 	},
// 	series: [0, 0, 0],
// 	labels: ["접수중", "처리중", "처리완료"],
// 	theme: {
// 		monochrome: {
// 			enabled: true,
// 			color: '#435EEF',
// 		}
// 	},
// colors: ['#6c757d', '#007bff', '#28a745'],
// 	// title: {
// 	// 	text: "Weekly Sales",
// 	// },
// 	responsive: [{
// 		breakpoint: 480,
// 		options: {
// 			chart: {
// 				width: 200
// 			},
// 			legend: {
// 				position: 'bottom'
// 			}
// 		}
// 	}],
// 	stroke: {
// 		width: 0,
// 	},
// }
var options3 = {
	chart: {
        height: 300,
        type: 'radialBar',
        toolbar: {
            show: false,
        },
    },
    title: {
		text: "※QnA",
	},
    plotOptions: {
        radialBar: {
            dataLabels: {
                name: {
                    fontSize: '12px',
                    fontColor: 'black',
            fontFamily: 'Merriweather',
                },
                value: {
                    fontSize: '21px',
                    fontFamily: 'Merriweather',
                },
                total: {
                    show: true,
                    label: 'QnA 종류',
                    formatter: function (w) {
                        const sum = w.globals.series.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
                        console.log("총합:"+sum)
                        return sum+"건"; // 총합 반환
                    }
                }
            }
        }
    },
    series: [25, 15, 44, 55, 58],
    labels: ["행정,서류", "세무", "교통", "불편사항", "기타"],
    colors: ['#4267cd', '#32b2fa', '#f87957', '#8e44ad', '#2e8b57'],
}
var chart1 = new ApexCharts(
	document.querySelector("#tpye_graph"),
	options1
);
var chart2 = new ApexCharts(
	document.querySelector("#complaint_graph"),
	options2
);
var chart3 = new ApexCharts(
	document.querySelector("#qna_graph"),
	options3
);
// chart1.render();
chart2.render();
chart3.render();


//index 페이지 Tasks
// var options = {
// 	chart: {
// 		height: 300,
// 		type: 'radialBar',
// 		toolbar: {
// 			show: false,
// 		},
// 	},
// 	plotOptions: {
// 		radialBar: {
// 			dataLabels: {
// 				name: {
// 					fontSize: '12px',
// 					fontColor: 'black',
//           fontFamily: 'Merriweather',
// 				},
// 				value: {
// 					fontSize: '21px',
// 					fontFamily: 'Merriweather',
// 				},
// 				total: {
// 					show: true,
// 					label: 'Tasks',
// 					formatter: function (w) {
// 						// By default this function returns the average of all series. The below is just an example to show the use of custom formatter function
// 						return '19'
// 					}
// 				}
// 			}
// 		}
// 	},
// 	series: [80, 70, 10],
// 	labels: ['New', 'Completed', 'Pending'],
// 	colors: ['#4267cd', '#32b2fa', '#f87957'],
// }

// var chart = new ApexCharts(
// 	document.querySelector("#taskGraph"),
// 	options
// );
// chart.render();
