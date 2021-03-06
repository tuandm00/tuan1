USE [master]
GO
/****** Object:  Database [HanaShop]    Script Date: 23-Jan-21 7:00:11 PM ******/
CREATE DATABASE [HanaShop]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'HanaShop', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\HanaShop.mdf' , SIZE = 3264KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'HanaShop_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL12.MSSQLSERVER\MSSQL\DATA\HanaShop_log.ldf' , SIZE = 832KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [HanaShop] SET COMPATIBILITY_LEVEL = 120
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [HanaShop].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [HanaShop] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [HanaShop] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [HanaShop] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [HanaShop] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [HanaShop] SET ARITHABORT OFF 
GO
ALTER DATABASE [HanaShop] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [HanaShop] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [HanaShop] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [HanaShop] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [HanaShop] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [HanaShop] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [HanaShop] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [HanaShop] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [HanaShop] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [HanaShop] SET  ENABLE_BROKER 
GO
ALTER DATABASE [HanaShop] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [HanaShop] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [HanaShop] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [HanaShop] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [HanaShop] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [HanaShop] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [HanaShop] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [HanaShop] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [HanaShop] SET  MULTI_USER 
GO
ALTER DATABASE [HanaShop] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [HanaShop] SET DB_CHAINING OFF 
GO
ALTER DATABASE [HanaShop] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [HanaShop] SET TARGET_RECOVERY_TIME = 0 SECONDS 
GO
ALTER DATABASE [HanaShop] SET DELAYED_DURABILITY = DISABLED 
GO
USE [HanaShop]
GO
/****** Object:  Table [dbo].[Follow]    Script Date: 23-Jan-21 7:00:11 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Follow](
	[followID] [int] IDENTITY(1,1) NOT NULL,
	[UserID] [nvarchar](50) NULL,
	[Date] [datetime] NULL,
	[Action] [nvarchar](50) NULL,
 CONSTRAINT [PK_Follow] PRIMARY KEY CLUSTERED 
(
	[followID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 23-Jan-21 7:00:11 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[ProductID] [int] IDENTITY(1,1) NOT NULL,
	[ProductName] [nvarchar](50) NULL,
	[Price] [float] NULL,
	[Description] [nvarchar](500) NULL,
	[Image] [nvarchar](50) NULL,
	[Quantity] [int] NULL,
	[Create_Date] [datetime] NULL,
	[Status] [bit] NULL,
 CONSTRAINT [PK_Product] PRIMARY KEY CLUSTERED 
(
	[ProductID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[User]    Script Date: 23-Jan-21 7:00:11 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[User](
	[UserID] [nvarchar](50) NULL,
	[Fullname] [nvarchar](50) NULL,
	[Password] [nvarchar](50) NULL,
	[Address] [nvarchar](50) NULL,
	[Email] [nvarchar](50) NULL,
	[Phone] [nchar](10) NULL,
	[Role] [nvarchar](50) NULL
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Follow] ON 

INSERT [dbo].[Follow] ([followID], [UserID], [Date], [Action]) VALUES (1, N'admin', CAST(N'2021-01-21T11:09:11.070' AS DateTime), N'add')
INSERT [dbo].[Follow] ([followID], [UserID], [Date], [Action]) VALUES (2, N'admin', CAST(N'2021-01-21T11:09:50.003' AS DateTime), N'add')
INSERT [dbo].[Follow] ([followID], [UserID], [Date], [Action]) VALUES (3, N'admin', CAST(N'2021-01-21T11:10:40.487' AS DateTime), N'add')
INSERT [dbo].[Follow] ([followID], [UserID], [Date], [Action]) VALUES (4, N'admin', CAST(N'2021-01-21T11:11:57.183' AS DateTime), N'add')
INSERT [dbo].[Follow] ([followID], [UserID], [Date], [Action]) VALUES (5, N'admin', CAST(N'2021-01-21T11:13:12.583' AS DateTime), N'add')
INSERT [dbo].[Follow] ([followID], [UserID], [Date], [Action]) VALUES (6, N'admin', CAST(N'2021-01-21T11:14:04.840' AS DateTime), N'add')
INSERT [dbo].[Follow] ([followID], [UserID], [Date], [Action]) VALUES (7, N'admin', CAST(N'2021-01-21T11:22:18.100' AS DateTime), N'add')
INSERT [dbo].[Follow] ([followID], [UserID], [Date], [Action]) VALUES (8, N'admin', CAST(N'2021-01-21T11:46:38.450' AS DateTime), N'delete')
SET IDENTITY_INSERT [dbo].[Follow] OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (1, N'Bread1', 50000, N'Bread is a staple food prepared from a dough of flour and water, usually by baking. Throughout recorded history, it has been a prominent food in large parts of the world', N'Bread1.jpg', 50, CAST(N'2021-01-07T10:41:25.010' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (2, N'Bread30', 500000, N'abcxyz', N'download (1).jpg', 100, CAST(N'2021-01-07T10:42:03.157' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (3, N'Bread3', 70000, N'Bread may be leavened by naturally occurring microbes, chemicals, industrially produced yeast, or high-pressure aeration. In many countries, commercial bread often contains additives to improve flavor, texture, color, shelf life, nutrition, and ease of production.', N'Bread3.jpg', 70, CAST(N'2021-01-07T10:42:29.920' AS DateTime), 0)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (4, N'Chips', 40000, N'Chips (hot food) or french fries, long chunks of potato that have been deep fried or baked', N'Chips.jpg', 20, CAST(N'2021-01-07T10:42:57.067' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (5, N'Mix Icecream', 80000, N'Mix the chips and icecream', N'Mix Icecream.jpg', 100, CAST(N'2021-01-07T10:43:25.463' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (6, N'Pizza', 60000, N'Pizza (Italian: [ˈpittsa], Neapolitan: [ˈpittsə]) is a savory dish of Italian

', N'Pizza.jpg', 0, CAST(N'2021-01-07T10:44:25.987' AS DateTime), 0)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (7, N'Sandwich and Chips', 120000, N'A sandwich is a food typically consisting of vegetables, sliced cheese or meat, placed on or between slices of bread, or more generally any dish wherein bread serves as a container or wrapper for another food type', N'Sandwich and Chips.jpg', 30, CAST(N'2021-01-07T10:44:53.447' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (8, N'Burger', 40000, N'A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. ', N'burger.jpg', 40, CAST(N'2021-01-07T10:45:28.790' AS DateTime), 0)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (9, N'Burger1', 50000, N'A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. ', N'Burger1.png', 50, CAST(N'2021-01-11T14:53:30.083' AS DateTime), 0)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (10, N'Burger2', 40000, N'A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. ', N'Burger2.jpg', 60, CAST(N'2021-01-11T14:54:55.323' AS DateTime), 0)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (11, N'Burger3', 60000, N'A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. ', N'Burger3.jpg', 100, CAST(N'2021-01-11T14:57:09.447' AS DateTime), 0)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (13, N'Burger4', 40000, N'A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. ', N'Burger4.jpg', 50, CAST(N'2021-01-12T11:17:47.893' AS DateTime), 0)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (14, N'22', 2000000, N'asdasdsa', N'', 0, CAST(N'2021-01-21T11:22:18.070' AS DateTime), 0)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (15, N'Burger5', 200000, N'A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. ', N'Burger4.jpg', 100, CAST(N'2021-01-21T17:59:23.207' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (16, N'Bread4', 50000, N'Bread is a staple food prepared from a dough of flour and water, usually by baking. Throughout recorded history, it has been a prominent food in large parts of the world', N'Bread1.jpg', 100, CAST(N'2021-01-21T17:59:55.987' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (17, N'Bread6', 50000, N'Bread is a staple food prepared from a dough of flour and water, usually by baking. Throughout recorded history, it has been a prominent food in large parts of the world', N'Bread1.jpg', 100, CAST(N'2021-01-21T18:00:18.723' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (18, N'Burger6', 50000, N'A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. ', N'Burger4.jpg', 100, CAST(N'2021-01-21T18:00:38.710' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (19, N'Bread7', 50000, N'Bread is a staple food prepared from a dough of flour and water, usually by baking. Throughout recorded history, it has been a prominent food in large parts of the world', N'Bread1.jpg', 100, CAST(N'2021-01-21T18:01:09.667' AS DateTime), 1)
INSERT [dbo].[Product] ([ProductID], [ProductName], [Price], [Description], [Image], [Quantity], [Create_Date], [Status]) VALUES (20, N'Burger7', 50000, N'A hamburger (also burger for short) is a sandwich consisting of one or more cooked patties of ground meat, usually beef, placed inside a sliced bread roll or bun. ', N'Burger4.jpg', 100, CAST(N'2021-01-21T18:01:29.380' AS DateTime), 1)
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
INSERT [dbo].[User] ([UserID], [Fullname], [Password], [Address], [Email], [Phone], [Role]) VALUES (N'admin', N'Do Minh Tuan', N'123', N'TPHCM', N'tuan@gmail.com', N'0123456789', N'AD')
INSERT [dbo].[User] ([UserID], [Fullname], [Password], [Address], [Email], [Phone], [Role]) VALUES (N'user', N'Le Quoc Dat', N'123', N'HALOI', N'dat@gmail.com', N'0123456987', N'US')
INSERT [dbo].[User] ([UserID], [Fullname], [Password], [Address], [Email], [Phone], [Role]) VALUES (N'116007388731823871724', N'dominhtuan23102000@gmail.com', NULL, NULL, N'dominhtuan23102000@gmail.com', NULL, N'')
GO
ALTER TABLE [dbo].[Follow] ADD  CONSTRAINT [DF_Follow_Date]  DEFAULT (getdate()) FOR [Date]
GO
ALTER TABLE [dbo].[Product] ADD  CONSTRAINT [DF_Product_Create_Date]  DEFAULT (getdate()) FOR [Create_Date]
GO
USE [master]
GO
ALTER DATABASE [HanaShop] SET  READ_WRITE 
GO
